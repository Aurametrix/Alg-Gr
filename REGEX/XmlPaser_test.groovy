def records = new XmlParser().parseText(XmlExamples.CAR_RECORDS)
def allRecords = records.car.size()
assert allRecords == 3
def allNodes = records.depthFirst().size()
assert allNodes == 10
def firstRecord = records.car[0]
assert 'car' == firstRecord.name()
assert 'Holden' == firstRecord.'@make'
assert 'Australia' == firstRecord.country.text()
// 2 cars have an 'e' in the make
assert 2 == records.car.findAll{ it.'@make'.contains('e') }.size()
// makes of cars that have an 's' followed by an 'a' in the country
assert ['Holden', 'Peel'] == records.car.findAll{ it.country.text() =~ '.*s.*a.*' }.'@make'
// types of records
assert ['speed', 'size', 'price'] == records.depthFirst().grep{ it.'@type' }.'@type'
// update to show what would happen if 'New Zealand' bought Holden
firstRecord.country[0].value = ['New Zealand']
assert 'New Zealand' == firstRecord.country.text()
// names of cars with records sorted by year
assert ['Royale', 'P50', 'HSV Maloo'] == records.car.sort{ it.'@year'.toInteger() }.'@name'
